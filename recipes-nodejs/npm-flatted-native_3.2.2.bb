SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.2.2.tgz"
SRC_URI[md5sum] = "a59626b02d9b4e0366aa451d33413d97"
SRC_URI[sha256sum] = "db5f37bf7f1252bc123781551a4e56b76b253647783302f9843d3a5b8177db64"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
