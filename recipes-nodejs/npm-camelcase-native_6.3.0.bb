SUMMARY = "NPM: camelcase"
DESCRIPTION = "Convert a dash/dot/underscore/space separated string to camelCase or PascalCase: `foo-bar` → `fooBar`"
HOMEPAGE = "https://github.com/sindresorhus/camelcase#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/camelcase/-/camelcase-6.3.0.tgz"
SRC_URI[md5sum] = "cde9397a5c3cbfcdb6a5e559f5c00cd4"
SRC_URI[sha256sum] = "2851fe487cf5607b5196895b13d6db4620200b225eec753897a9759f8912adb6"

NPM_PKGNAME = "camelcase"

inherit npmhelper
inherit native
