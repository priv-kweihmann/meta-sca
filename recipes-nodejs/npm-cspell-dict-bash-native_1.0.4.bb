SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.0.4.tgz"
SRC_URI[md5sum] = "0d5ec04fe4b8df788875338ca1aefe02"
SRC_URI[sha256sum] = "c3ea26f06eb3a32271503f5fb40913a5db46e5a6c54600d960bd0542e1d5178d"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
