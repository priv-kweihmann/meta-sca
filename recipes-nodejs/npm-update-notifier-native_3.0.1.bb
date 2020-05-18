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
           npm-semver-diff-native \
           npm-xdg-basedir-native"

SRC_URI = "https://registry.npmjs.org/update-notifier/-/update-notifier-3.0.1.tgz"
SRC_URI[md5sum] = "f6202fc11afd38c80cc36de5220cbe51"
SRC_URI[sha256sum] = "d5d6ef5955ac6a57fa0f3a093038d8984f67258cb304b5eefdd750294ac22b8d"

NPM_PKGNAME = "update-notifier"

inherit npmhelper
inherit native
