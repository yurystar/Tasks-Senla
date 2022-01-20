package consoleuserinterface.actions;

import com.senla.elhoteladmin.service.RoomService;
import consoleuserinterface.ScanUtil;

import java.util.Scanner;

public class ShowSortedRooms implements IAction {
    private final RoomService roomService = RoomService.getInstance();

    public void showAllSortedRooms() {
        int number = -1;
        do {
            System.out.print("""
                    Показать все номера сортированные по цене (Введите 1).\s
                    Показать все номера сортированные по вместимости (Введите 2).\s
                    Показать все номера сортированные по количеству звезд (Введите 3).\s
                    Или введите 0 для выхода. - \s""");
            System.out.println();

            number = ScanUtil.getInt();

            if (number == 1) {
                System.out.println(roomService.getHotelRoomsSortedByRoomPrice());
                System.out.println();
            } else if (number == 2) {
                System.out.println(roomService.getHotelRoomsSortedByRoomPlaces());
                System.out.println();
            } else if (number == 3) {
                System.out.println(roomService.getHotelRoomsSortedByRoomType());
                System.out.println();
            } else if (number == 0) {
                System.out.println("Просмотр комнат завершен.\n");
            } else System.out.println("Нет такого выбора. Попробуйте еще раз.\n");

        } while (number != 0);
        System.out.println("----------------------------------------------------------------------------");
    }

    public void showEmptySortedRooms() {
        int number = -1;
        do {
            System.out.print("""
                    Показать свободные номера сортированные по цене (Введите 1).\s
                    Показать свободные номера сортированные по вместимости (Введите 2).\s
                    Показать свободные номера сортированные по количеству звезд (Введите 3).\s
                    Или введите 0 для выхода. - \s""");
            System.out.println();

            number = ScanUtil.getInt();

            if (number == 1) {
                System.out.println(roomService.getEmptyHotelRoomsSortedByRoomPrice());
                System.out.println();
            } else if (number == 2) {
                System.out.println(roomService.getEmptyHotelRoomsSortedByRoomPlaces());
                System.out.println();
            } else if (number == 3) {
                System.out.println(roomService.getEmptyHotelRoomsSortedByRoomType());
                System.out.println();
            } else if (number == 0) {
                System.out.println("Просмотр свободных комнат завершен.\n");
            } else System.out.println("Нет такого выбора. Попробуйте еще раз.\n");

        } while (number != 0);
        System.out.println("----------------------------------------------------------------------------");
    }

    @Override
    public void execute() {
        int number = -1;
        do {
            System.out.print("Показать все номера (Введите 1). \n" +
                    "Показать свободные номера (Введите 2). \n" +
                    "Выход в предыдущее меню (Введите 0). -  ");
            System.out.println();

            number = ScanUtil.getInt();
            if (number == 1) {
                showAllSortedRooms();
            } else if (number == 2) {
                showEmptySortedRooms();
            } else if (number == 0) {
                System.out.println("Завершено. Выход в предыдущее меню.\n");
            } else System.out.println("Нет такого выбора. Попробуйте еще раз.\n");

        } while (number != 0);
        System.out.println("----------------------------------------------------------------------------");
    }
}

