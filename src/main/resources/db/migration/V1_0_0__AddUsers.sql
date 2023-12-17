INSERT INTO public.user_entity(
    id, email, name, password, username, city, role_id)
VALUES (1, 'testemail1@1com.ri', 'Oleg oleg olegovich', '123123', 'oleg', ?, 2),
       (2, 'testemail2@2com.ri', 'Vasya vasya vasievich', '123123', 'vasya', ?, 1),
        (3, 'testemail3@3com.ri', 'Dadya dadya dadyevich', '123123', 'dadya', ?, 1)
;