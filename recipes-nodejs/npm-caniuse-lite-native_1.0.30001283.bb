SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001283.tgz"
SRC_URI[md5sum] = "a85682dbb7096f7fff3e193215fc539a"
SRC_URI[sha256sum] = "cc975e81e8f08870274e123314a8f86cd463f53ed902c3a7c1117f13ad6183ea"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
