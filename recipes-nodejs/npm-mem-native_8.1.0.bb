SUMMARY = "NPM: mem"
DESCRIPTION = "Memoize functions - An optimization used to speed up consecutive function calls by caching the result of calls with identical input"
HOMEPAGE = "https://github.com/sindresorhus/mem#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-map-age-cleaner-native \
           npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/mem/-/mem-8.1.0.tgz"
SRC_URI[md5sum] = "6fdad62e41b40cc3f5d06f944ef4cf04"
SRC_URI[sha256sum] = "e5719c168c41aeb15975ce41787bd475367d796d973361f33e3ace12d9428c3e"

NPM_PKGNAME = "mem"

inherit npmhelper
inherit native
