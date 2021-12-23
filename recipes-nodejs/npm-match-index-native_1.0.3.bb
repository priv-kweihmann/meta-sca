SUMMARY = "NPM: match-index"
DESCRIPTION = "match capture groups and return index"
HOMEPAGE = "https://github.com/azu/match-index"

DEPENDS = "npm-regexp.prototype.flags-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/match-index/-/match-index-1.0.3.tgz"
SRC_URI[md5sum] = "ce5213a339bd3addc5f2ede03cf7ea89"
SRC_URI[sha256sum] = "0bd1238fef356f9f3a3b6b27f6017766a497f8ba210d40aeb2567dddec0f5883"

NPM_PKGNAME = "match-index"

inherit npmhelper
inherit native
