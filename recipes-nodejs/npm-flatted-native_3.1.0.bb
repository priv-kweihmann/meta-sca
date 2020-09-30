SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.1.0.tgz"
SRC_URI[md5sum] = "649b1e4551ee3651a92de36fe0a71db9"
SRC_URI[sha256sum] = "e5cf5f81a264bc6baf6d023ea17daec4292627202d0be7ca65e58045f498b1cc"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
