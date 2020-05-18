SUMMARY = "NPM: isarray"
DESCRIPTION = "Array#isArray for older browsers"
HOMEPAGE = "https://github.com/juliangruber/isarray"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/isarray/-/isarray-2.0.5.tgz"
SRC_URI[md5sum] = "45d3871b525cb6529c7258cfbdf4104d"
SRC_URI[sha256sum] = "72bae463b81a604b4a118c00012c76ee9b8d155b9da62d1f362876c9f8b5f793"

NPM_PKGNAME = "isarray"

inherit npmhelper
inherit native
