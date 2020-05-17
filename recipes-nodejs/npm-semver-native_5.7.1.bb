SUMMARY = "NPM: semver"
DESCRIPTION = "The semantic version parser used by npm."
HOMEPAGE = "https://github.com/npm/node-semver#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/semver/-/semver-5.7.1.tgz"
SRC_URI[md5sum] = "99453010ab0aad4c49dba769e6193c35"
SRC_URI[sha256sum] = "fef2fb32aa27fc28c2e834336469d84615cb187449e3622caa2897a0535db56d"

NPM_PKGNAME = "semver"

inherit npmhelper
inherit native
