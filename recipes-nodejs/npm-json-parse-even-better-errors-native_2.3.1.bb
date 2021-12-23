SUMMARY = "NPM: json-parse-even-better-errors"
DESCRIPTION = "JSON.parse with context information on error"
HOMEPAGE = "https://github.com/npm/json-parse-even-better-errors#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=16d4ff0e774195fa8cee4940a14e99d6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-parse-even-better-errors/-/json-parse-even-better-errors-2.3.1.tgz"
SRC_URI[md5sum] = "cb06ab052156aa6bf3d9718b36644ba7"
SRC_URI[sha256sum] = "2a8777d261ab081cd4ccb41b79d26d48e877dba14ba4ae12dec2d4b6ef852569"

NPM_PKGNAME = "json-parse-even-better-errors"

inherit npmhelper
inherit native
