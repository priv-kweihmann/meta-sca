SUMMARY = "NPM: nice-try"
DESCRIPTION = "Tries to execute a function and discards any error that occurs"
HOMEPAGE = "https://github.com/electerious/nice-try"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23e09bd5f925127de4457125cbd1beca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/nice-try/-/nice-try-2.1.0.tgz"
SRC_URI[md5sum] = "cb36129a392001f1437311c9ed51eefe"
SRC_URI[sha256sum] = "ae0ce643b3a90dbbe1406dfd26351d47d797169408828b2b407bd68e67b067bb"

NPM_PKGNAME = "nice-try"

inherit npmhelper
inherit native
