SUMMARY = "NPM: picomatch"
DESCRIPTION = "Blazing fast and accurate glob matcher written in JavaScript, with no dependencies and full support for standard and extended Bash glob features, including braces, extglobs, POSIX brackets, and regular expressions."
HOMEPAGE = "https://github.com/micromatch/picomatch"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=abd0e25891525eb13d5a794f550a6ee4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/picomatch/-/picomatch-2.3.0.tgz"
SRC_URI[md5sum] = "21b93be8448e9e1f9167e305ad1b4c79"
SRC_URI[sha256sum] = "ec81cbb36546358b4369be6521148b129569dc0a51fd0154af618326f89a3596"

NPM_PKGNAME = "picomatch"

inherit npmhelper
inherit native
