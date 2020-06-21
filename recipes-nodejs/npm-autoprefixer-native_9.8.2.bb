SUMMARY = "NPM: autoprefixer"
DESCRIPTION = "Parse CSS and add vendor prefixes to CSS rules using values from the Can I Use website"
HOMEPAGE = "https://github.com/postcss/autoprefixer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-browserslist-native \
           npm-caniuse-lite-native \
           npm-kleur-native \
           npm-normalize-range-native \
           npm-num2fraction-native \
           npm-postcss-native \
           npm-postcss-value-parser-native"

SRC_URI = "https://registry.npmjs.org/autoprefixer/-/autoprefixer-9.8.2.tgz"
SRC_URI[md5sum] = "2f492de661e5a344a7a92ea848ecda9c"
SRC_URI[sha256sum] = "2818db549ac87f8191398d6fc410ac96f548bbf4692cb496ddfc2b6a9e2bd30d"

NPM_PKGNAME = "autoprefixer"

inherit npmhelper
inherit native
