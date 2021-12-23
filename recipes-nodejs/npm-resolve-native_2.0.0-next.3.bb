SUMMARY = "NPM: resolve"
DESCRIPTION = "resolve like require.resolve() on behalf of files asynchronously and synchronously"
HOMEPAGE = "https://github.com/browserify/resolve#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=baa47288b5bd3e657a01886ce3dd0cb6"

DEPENDS = "npm-is-core-module-native \
           npm-path-parse-native"

SRC_URI = "https://registry.npmjs.org/resolve/-/resolve-2.0.0-next.3.tgz"
SRC_URI[md5sum] = "4c4b44ede4eca72b5859c177733700b3"
SRC_URI[sha256sum] = "4fab90bee86e697d188ca950438a75aadee891adaaeab575de19d17595796ea9"

NPM_PKGNAME = "resolve"

inherit npmhelper
inherit native
