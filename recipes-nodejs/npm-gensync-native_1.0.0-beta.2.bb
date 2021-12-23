SUMMARY = "NPM: gensync"
DESCRIPTION = "Allows users to use generators in order to write common functions that can be both sync or async."
HOMEPAGE = "https://github.com/loganfsmyth/gensync"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4edef26a9728782f6e6a4ca612cfc1fb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/gensync/-/gensync-1.0.0-beta.2.tgz"
SRC_URI[md5sum] = "3d1e68bdacb4e8046ccabff0019e916b"
SRC_URI[sha256sum] = "df9f92ef26a35d4f92cb8a73415dfea8dadaf294a03e60e4d176df82f38d17c9"

NPM_PKGNAME = "gensync"

inherit npmhelper
inherit native
