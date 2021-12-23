SUMMARY = "NPM: uvu"
DESCRIPTION = "uvu is an extremely fast and lightweight test runner for Node.js and the browser"
HOMEPAGE = "https://github.com/lukeed/uvu#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = "npm-dequal-native \
           npm-diff-native \
           npm-kleur-native \
           npm-sade-native \
           npm-totalist-native"

SRC_URI = "https://registry.npmjs.org/uvu/-/uvu-0.5.2.tgz"
SRC_URI[md5sum] = "8cb279f9da16db13728bdf0d917fb3e8"
SRC_URI[sha256sum] = "723f742b2cc77a89234a671a69590f2dc12e92e1bd0869962014c4e237348c22"

NPM_PKGNAME = "uvu"

inherit npmhelper
inherit native
