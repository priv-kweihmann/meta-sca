SUMMARY = "NPM: picomatch"
DESCRIPTION = "Blazing fast and accurate glob matcher written in JavaScript, with no dependencies and full support for standard and extended Bash glob features, including braces, extglobs, POSIX brackets, and regular expressions."
HOMEPAGE = "https://github.com/micromatch/picomatch"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/picomatch/-/picomatch-2.3.1.tgz"
SRC_URI[md5sum] = "fa0a8505a751a04b4cff2285257ddf73"
SRC_URI[sha256sum] = "1b14ee9ec867c090d7b52c77193d83e77910553b3d18b2f86dd2b7b55e82c11f"

NPM_PKGNAME = "picomatch"

inherit npmhelper
inherit native
