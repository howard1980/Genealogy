(function(window, undefined) {
  var dictionary = {
    "1b7cec65-897e-446e-80f0-8735d48f2b47": "stipulate2",
    "1d5436db-8a86-4fa9-b2a6-6ae2776410ba": "stipulate1",
    "cf7f48fc-1fe0-4786-8fb9-51852ade0719": "familyEdit",
    "87d7a29e-31cd-4052-8c71-996a2be79430": "comment",
    "f30b580d-2fb6-4e69-8695-5e32ffb4e70d": "fact",
    "85a5bfeb-fbf6-4f6e-b0bf-f08da6e18d84": "Person",
    "797e7f57-65ca-4173-9247-8d624cb82cf5": "vidio",
    "17516981-8750-466e-8ae3-d897f5545021": "ActionMember",
    "1d09eb8e-5af9-4c9c-bbd8-f7018641982c": "address",
    "34f997cd-fad9-4405-ab32-95fcd4bcf641": "AddPerson",
    "e6288c7b-e104-4099-b123-a151fc34c73c": "FamilyList",
    "cbf5763b-878a-4c77-8621-4d695de3077a": "Clansman",
    "99651279-01e5-4840-ace5-322fa5dfab46": "Invitation",
    "2019ecf7-f47a-4038-8209-e7c723faeac0": "regist",
    "c02ddc71-9fda-4633-a8be-111d895a3e12": "message",
    "589a1ccf-d9de-4b95-acbd-27de02fd0766": "question",
    "a0355a66-14a6-4a1d-a81f-361ed08ff321": "MemberTree",
    "e2845132-b7b4-4a1e-8690-70d45c000a9d": "login",
    "9f920400-b7d5-431f-a170-641d17fb38d8": "add",
    "52e69561-0333-4e9e-9fe0-5115051a7f5b": "image",
    "05597ccd-620f-473a-a766-0f5d8c72fea0": "myself",
    "040d5862-acda-4102-8d19-c7f83be5b54a": "Edit",
    "be6d40ff-3dc2-4b7f-9327-0baa97c4d0ac": "action",
    "e1234ac4-683b-4410-9c7f-edd50239bc22": "ActionMap",
    "e90152cf-73cc-48de-884b-1453606eedec": "MemberList",
    "e83abd4a-1ecc-4169-b7a6-40714d27188d": "actioninfo",
    "476fd328-7c81-4abf-bba4-f429220bc0fc": "family",
    "d12245cc-1680-458d-89dd-4f0d7fb22724": "Home",
    "f4460ad0-3766-4e51-9202-80baa438197b": "Finder",
    "e8129a9a-c5e8-435f-89f3-10e62626a21f": "show",
    "0484ad37-6fe5-429c-87a5-d007469ee49c": "map",
    "9040e5c6-3c89-4bab-abbb-baab8bb2aec5": "mysetting",
    "453cc80a-daa1-4778-902a-9c44fac2c66e": "PhoneBook",
    "f39803f7-df02-4169-93eb-7547fb8c961a": "Template 1"
  };

  var uriRE = /^(\/#)?(screens|templates|masters)\/(.*)(\.html)?/;
  window.lookUpURL = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, url;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      url = folder + "/" + canvas;
    }
    return url;
  };

  window.lookUpName = function(fragment) {
    var matches = uriRE.exec(fragment || "") || [],
        folder = matches[2] || "",
        canvas = matches[3] || "",
        name, canvasName;
    if(dictionary.hasOwnProperty(canvas)) { /* search by name */
      canvasName = dictionary[canvas];
    }
    return canvasName;
  };
})(window);