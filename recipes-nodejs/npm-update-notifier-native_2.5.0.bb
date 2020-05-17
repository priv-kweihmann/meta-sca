SUMMARY = "NPM: update-notifier"
DESCRIPTION = "Update notifications for your CLI app"
HOMEPAGE = "https://github.com/yeoman/update-notifier#readme"

DEPENDS = "npm-boxen-native npm-chalk-native npm-configstore-native npm-import-lazy-native npm-is-ci-native npm-is-installed-globally-native npm-is-npm-native npm-latest-version-native npm-semver-diff-native npm-xdg-basedir-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license;md5=893ad33659c31c56c0f4ba00ac978281"

SRC_URI = "https://registry.npmjs.org/update-notifier/-/update-notifier-2.5.0.tgz"
SRC_URI[md5sum] = "c805feee28c69e8b0ac88ffc189ef515"
SRC_URI[sha256sum] = "d706e4219e90468cdb42e3cde25399b4fe320fec74c874040c2fe83950c1da51"

NPM_PKGNAME = "update-notifier"

inherit npmhelper
inherit native
