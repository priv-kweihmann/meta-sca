SUMMARY = "NPM: update-notifier"
DESCRIPTION = "Update notifications for your CLI app"
HOMEPAGE = "https://github.com/yeoman/update-notifier#readme"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license;md5=893ad33659c31c56c0f4ba00ac978281"

DEPENDS = "npm-boxen-native \
           npm-chalk-native \
           npm-configstore-native \
           npm-has-yarn-native \
           npm-import-lazy-native \
           npm-is-ci-native \
           npm-is-installed-globally-native \
           npm-is-npm-native \
           npm-is-yarn-global-native \
           npm-latest-version-native \
           npm-pupa-native \
           npm-semver-diff-native \
           npm-xdg-basedir-native"

SRC_URI = "https://registry.npmjs.org/update-notifier/-/update-notifier-4.1.1.tgz"
SRC_URI[md5sum] = "49f4cd96d99e1eb7943dbd88133daf69"
SRC_URI[sha256sum] = "d306865e7446a07c9d9d58ff2cb96aadbc21cec676d8364ad81c77ecc5b40c98"

NPM_PKGNAME = "update-notifier"

inherit npmhelper
inherit native
