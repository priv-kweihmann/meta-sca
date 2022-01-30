SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.2.5.tgz"
SRC_URI[md5sum] = "b33878152c8a0aa44f58be5870e4a146"
SRC_URI[sha256sum] = "220653ac9146a7a4f777aaeff25f4c32cd30a145f0bb07dcc5235a76a58f2d4b"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
