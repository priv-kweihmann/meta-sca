SUMMARY = "NPM: picomatch"
DESCRIPTION = "Blazing fast and accurate glob matcher written in JavaScript, with no dependencies and full support for standard and extended Bash glob features, including braces, extglobs, POSIX brackets, and regular expressions."
HOMEPAGE = "https://github.com/micromatch/picomatch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/picomatch/-/picomatch-2.2.3.tgz"
SRC_URI[md5sum] = "a3fff3731b0e57765cf302757cf16088"
SRC_URI[sha256sum] = "5d8c1f5b50a9a5a5d6092dfcf61ee6d1ede4c1a04f13b14fe78e9642e28b4a54"

NPM_PKGNAME = "picomatch"

inherit npmhelper
inherit native
