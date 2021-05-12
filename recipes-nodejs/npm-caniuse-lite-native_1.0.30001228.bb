SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001228.tgz"
SRC_URI[md5sum] = "4975be3bec932f76b556f903ac751e7e"
SRC_URI[sha256sum] = "f002c3fdf4dba2b8021f887873272b4b6b9b622f955ed26df39c4d604e374667"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
