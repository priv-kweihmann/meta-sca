SUMMARY = "NPM: istextorbinary"
DESCRIPTION = "Determine if a filename and/or buffer is text or binary. Smarter detection than the other solutions."
HOMEPAGE = "https://github.com/bevry/istextorbinary"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=0fd8645059211e9fe4737701ca81bb98"

DEPENDS = "npm-binaryextensions-native \
           npm-textextensions-native"

SRC_URI = "https://registry.npmjs.org/istextorbinary/-/istextorbinary-6.0.0.tgz"
SRC_URI[md5sum] = "91f74b62e8ba70f316aa187a84c0cf91"
SRC_URI[sha256sum] = "2187eee622b73d77be84701daab35be301ef31febee1a76c4bfb946fd9621bd9"

NPM_PKGNAME = "istextorbinary"

inherit npmhelper
inherit native
