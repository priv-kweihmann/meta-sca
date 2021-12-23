SUMMARY = "NPM: data-uri-to-buffer"
DESCRIPTION = "Generate a Buffer instance from a Data URI string"
HOMEPAGE = "https://github.com/TooTallNate/node-data-uri-to-buffer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=65;md5=a448c2725100d39d73e324e98955397d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/data-uri-to-buffer/-/data-uri-to-buffer-4.0.0.tgz"
SRC_URI[md5sum] = "95bab0fbcfbbc91ce76d8485211381e7"
SRC_URI[sha256sum] = "92f49c63fd048dc64268a5a894a858d1ec0c4428c07aef28b023dc50843fa467"

NPM_PKGNAME = "data-uri-to-buffer"

inherit npmhelper
inherit native
