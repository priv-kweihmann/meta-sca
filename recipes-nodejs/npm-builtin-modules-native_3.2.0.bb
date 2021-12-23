SUMMARY = "NPM: builtin-modules"
DESCRIPTION = "List of the Node.js builtin modules"
HOMEPAGE = "https://github.com/sindresorhus/builtin-modules#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/builtin-modules/-/builtin-modules-3.2.0.tgz"
SRC_URI[md5sum] = "b7a8e748874d1e0f3912d29631c73346"
SRC_URI[sha256sum] = "b4a449bc811815d4efa06ae1b8d0922d3daa926bcd4fab387c25b31ccc81e83a"

NPM_PKGNAME = "builtin-modules"

inherit npmhelper
inherit native
