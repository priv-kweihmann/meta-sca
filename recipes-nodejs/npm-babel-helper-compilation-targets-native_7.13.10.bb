SUMMARY = "NPM: @babel/helper-compilation-targets"
DESCRIPTION = "Engine compat data used in @babel/preset-env"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-compat-data-native \
           npm-babel-helper-validator-option-native \
           npm-browserslist-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-compilation-targets/-/helper-compilation-targets-7.13.10.tgz"
SRC_URI[md5sum] = "803e761a763e109decca7caaefd4f173"
SRC_URI[sha256sum] = "51141d9491bb701063f671d1aef93232ec12db22f61d019276ec26c56421c268"

NPM_PKGNAME = "@babel/helper-compilation-targets"

inherit npmhelper
inherit native
