SUMMARY = "NPM: css-functions-list"
DESCRIPTION = "List of standard and browser specific CSS functions."
HOMEPAGE = "https://github.com/niksy/css-functions-list#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=25ebb5527090c2ea2143246aa6501c37"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/css-functions-list/-/css-functions-list-3.0.0.tgz"
SRC_URI[md5sum] = "d3c7c4a57bdd3b8acdb440df398c8dbc"
SRC_URI[sha256sum] = "b5a09a079176eacb7e1a003499c1d5b74d3a3269e7721891907cc9eb2d1c04b9"

NPM_PKGNAME = "css-functions-list"

inherit npmhelper
inherit native
