SUMMARY = "NPM: is-unicode-supported"
DESCRIPTION = "Detect whether the terminal supports Unicode"
HOMEPAGE = "https://github.com/sindresorhus/is-unicode-supported#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-unicode-supported/-/is-unicode-supported-1.0.0.tgz"
SRC_URI[md5sum] = "528d0153c105c88ca29a0ee42db51a33"
SRC_URI[sha256sum] = "f6127d094bb8911857b18074e8777cfeee6e7d79f313a9fdfd57037c9c44acd1"

NPM_PKGNAME = "is-unicode-supported"

inherit npmhelper
inherit native
