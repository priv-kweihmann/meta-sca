SUMMARY = "NPM: contains-path"
DESCRIPTION = "Return true if a file path contains the given path."
HOMEPAGE = "https://github.com/jonschlinkert/contains-path"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7159ba8f2e9f17d4c29d1a73c4f4b759"

DEPENDS = "npm-normalize-path-native \
           npm-path-starts-with-native"

SRC_URI = "https://registry.npmjs.org/contains-path/-/contains-path-1.0.0.tgz"
SRC_URI[md5sum] = "5de40a45b4eb5a3fa2ec9012d9c04667"
SRC_URI[sha256sum] = "30ef79ffe19e96f688527d79fba7cef1845ddcb0a9dfa7f41c3e375a658f5a3b"

NPM_PKGNAME = "contains-path"

inherit npmhelper
inherit native
