SUMMARY = "NPM: camelcase"
DESCRIPTION = "Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`"
HOMEPAGE = "https://github.com/sindresorhus/camelcase#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/camelcase/-/camelcase-6.2.1.tgz"
SRC_URI[md5sum] = "d14a653ec4c2bdbc4a054b0dbce79d87"
SRC_URI[sha256sum] = "07b3b755b39bbc93fed6f67753d4ed3f1a606ebeedc860678162bd9fe30b45c1"

NPM_PKGNAME = "camelcase"

inherit npmhelper
inherit native
