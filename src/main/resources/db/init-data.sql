INSERT INTO ARTICLES(id, title, anons, category, fulltext)
VALUES ('48a95af7-8b83-4a08-8001-0f865db8ea26', 'Iphone 13', 'New gorgeous Phone', 'gadgets', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Euismod nisi porta lorem mollis aliquam ut porttitor leo. Massa placerat duis ultricies lacus sed turpis tincidunt. Amet mauris commodo quis imperdiet. Sed id semper risus in hendrerit gravida rutrum quisque. Pulvinar pellentesque habitant morbi tristique senectus et netus et malesuada. Turpis cursus in hac habitasse platea.'),
       ('15a95af7-8b83-4a08-8001-0f865db8ea27', 'Samsung Z3', 'Its something', 'gadgets','Habitant morbi tristique senectus et netus et malesuada fames ac. Odio euismod lacinia at quis risus sed. Id velit ut tortor pretium. Est lorem ipsum dolor sit amet. Et leo duis ut diam quam nulla porttitor. Ullamcorper eget nulla facilisi etiam. Blandit volutpat maecenas volutpat blandit aliquam etiam erat velit. Neque ornare aenean euismod elementum nisi. Pellentesque habitant morbi tristique senectus. Est placerat in egestas erat imperdiet sed euismod nisi porta.'),
       ('58a95af7-8b83-4a08-8001-0f865db8ea26', 'Iphone 10', 'Middleages Phone', 'gadgets','Mi sit amet mauris commodo quis imperdiet massa. Pellentesque sit amet porttitor eget dolor. Urna et pharetra pharetra massa massa ultricies mi quis. Proin fermentum leo vel orci porta non pulvinar. Tellus molestie nunc non blandit massa. Lacinia at quis risus sed vulputate odio ut enim blandit. Nullam vehicula ipsum a arcu. Ante metus dictum at tempor commodo ullamcorper a lacus vestibulum. Tortor vitae purus faucibus ornare suspendisse sed nisi.'),
       ('98a95af7-8b83-4a08-8001-0f865db8ea26', 'iphone 9', 'Ancient Phone', 'gadgets','Placerat vestibulum lectus mauris ultrices. Pretium aenean pharetra magna ac. Amet tellus cras adipiscing enim eu turpis egestas pretium aenean. Eget aliquet nibh praesent tristique magna sit. Nunc congue nisi vitae suscipit tellus mauris a diam maecenas. Aliquet bibendum enim facilisis gravida neque convallis a cras. Aliquet sagittis id consectetur purus ut faucibus pulvinar elementum. Faucibus ornare suspendisse sed nisi. Massa massa ultricies mi quis hendrerit dolor magna.'),
       ('45a95af7-8b83-4a08-8001-0f865db8ea27', 'Samsung Z2', 'Not a new Phone', 'gadgets','Leo urna molestie at elementum eu facilisis sed. Velit sed ullamcorper morbi tincidunt. Magna fermentum iaculis eu non diam phasellus vestibulum lorem sed. Vitae proin sagittis nisl rhoncus mattis rhoncus urna neque. Enim neque volutpat ac tincidunt vitae semper quis lectus nulla. Felis bibendum ut tristique et egestas quis ipsum suspendisse ultrices. Consequat ac felis donec et odio. Nam at lectus urna duis convallis.');

INSERT INTO COMMENTS(id,text, article_id) VALUES
       ('48a95af7-8b83-4a08-8001-0f865db8ea26', 'Kas cia per nesamone', '48a95af7-8b83-4a08-8001-0f865db8ea26'),
       ('15a95af7-8b83-4a08-8001-0f865db8ea27', 'Koks puikus temos isdestymas', '48a95af7-8b83-4a08-8001-0f865db8ea26');
/*
INSERT INTO USERS(id, username, name, surname,  phone, password) VALUES
       ('c2aa5f20-2441-40f8-8cce-d31dbd17bc84', 'user', 'Useriukas', 'Useriauskas', '867489665', '{bcrypt}$2a$10$jYIbAef1H7S.womsk7MRtOCSEx/DgM7CZ1nNeLLzoZ/OPs0a25DV2'), /*pass->user*/
       ('bd8968db-ad2a-4dd0-a0ab-7eebcc05427e', 'admin', 'Adminas', 'Adminiauskas', '867489665','{bcrypt}$2a$10$VylYhXDaKC7W28tQTvYYkOdZIj2pnPVIobXOConbXy3xeBcF6Xuni'); /*pass->user*/

INSERT INTO ROLES(id, name) VALUES
       ('60dbb7bb-99a0-42eb-a837-8be6b697c074', 'USER'),
       ('3906c549-44bf-494b-9537-5e1658a029a8', 'ADMIN');

INSERT INTO USERS_ROLES(user_id, roles_id) VALUES
       ('c2aa5f20-2441-40f8-8cce-d31dbd17bc84', '60dbb7bb-99a0-42eb-a837-8be6b697c074'),
       ('bd8968db-ad2a-4dd0-a0ab-7eebcc05427e', '60dbb7bb-99a0-42eb-a837-8be6b697c074'),
       ('bd8968db-ad2a-4dd0-a0ab-7eebcc05427e', '3906c549-44bf-494b-9537-5e1658a029a8');    */