SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001132.tgz"
SRC_URI[md5sum] = "a83d1a960a2756298b61fcf2019d87b4"
SRC_URI[sha256sum] = "6bbb06ddb76642aaa1a0548366e253a06f1b801e962e599fdd4b45669ea9ecea"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
