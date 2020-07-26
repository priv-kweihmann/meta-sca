SUMMARY = "NPM: is-plain-object"
DESCRIPTION = "Returns true if an object was created by the `Object` constructor, or Object.create(null)."
HOMEPAGE = "https://github.com/jonschlinkert/is-plain-object"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d83ea4c8ec9b31d9ff2c82fa29beabb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-plain-object/-/is-plain-object-4.1.1.tgz"
SRC_URI[md5sum] = "294c38887d2904b8965fee66eb809d47"
SRC_URI[sha256sum] = "a41ac8bd95b76bfe863d7917cc7ee355c682e9e66f94d4418f61521089350d6f"

NPM_PKGNAME = "is-plain-object"

inherit npmhelper
inherit native
