SUMMARY = "NPM: ccount"
DESCRIPTION = "Count how often a character (or substring) is used in a string"
HOMEPAGE = "https://github.com/wooorm/ccount#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ccount/-/ccount-2.0.1.tgz"
SRC_URI[md5sum] = "ee6c7415c086aa0e0c4d2a4fcc6a2741"
SRC_URI[sha256sum] = "bdda8b4b3c7c3049bb118a9a01e3638033473b90c09f58eee1e9f2dda27984ca"

NPM_PKGNAME = "ccount"

inherit npmhelper
inherit native
