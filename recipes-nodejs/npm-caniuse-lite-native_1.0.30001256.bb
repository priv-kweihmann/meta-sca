SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001256.tgz"
SRC_URI[md5sum] = "d53d295464df44c4e8edde6ed01887a3"
SRC_URI[sha256sum] = "acf0e5706480d212191f64c1970a0ee16fa429fe58b93980a533a748d6be7556"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
