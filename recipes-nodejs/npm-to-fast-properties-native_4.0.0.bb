SUMMARY = "NPM: to-fast-properties"
DESCRIPTION = "Force V8 to use fast properties for an object"
HOMEPAGE = "https://github.com/sindresorhus/to-fast-properties#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=e45fa4fe9e865fa9c8d03c7630983122"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/to-fast-properties/-/to-fast-properties-4.0.0.tgz"
SRC_URI[md5sum] = "a0d2bedcfbbd173214a88b8ec9c3b3c9"
SRC_URI[sha256sum] = "7b8adfe0667b52511f00c2ab42f44c33170059019b36a589e3de94fcb6429406"

NPM_PKGNAME = "to-fast-properties"

inherit npmhelper
inherit native
