SUMMARY = "NPM: available-typed-arrays"
DESCRIPTION = "Returns an array of Typed Array names that are available in the current environment"
HOMEPAGE = "https://github.com/inspect-js/available-typed-arrays#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838b75dc6028daf3e04e57871b7ad3ed"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/available-typed-arrays/-/available-typed-arrays-1.0.5.tgz"
SRC_URI[md5sum] = "8c022a7f180ab151d211cfb2f4371d86"
SRC_URI[sha256sum] = "9b6ca1511007dddc09e74f3b9d83a9a9cb3b3b538db216a262fc1fced79daf1b"

NPM_PKGNAME = "available-typed-arrays"

inherit npmhelper
inherit native
