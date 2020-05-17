SUMMARY = "NPM: picomatch"
DESCRIPTION = "Blazing fast and accurate glob matcher written in JavaScript, with no dependencies and full support for standard and extended Bash glob features, including braces, extglobs, POSIX brackets, and regular expressions."
HOMEPAGE = "https://github.com/micromatch/picomatch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4"

SRC_URI = "https://registry.npmjs.org/picomatch/-/picomatch-2.2.2.tgz"
SRC_URI[md5sum] = "779a92f2024d89a858e1dcdd469de315"
SRC_URI[sha256sum] = "00ba0896db003bba593ff4405d7cd14887eb41a81c09c9eb3bf665168deb86c8"

NPM_PKGNAME = "picomatch"

inherit npmhelper
inherit native
