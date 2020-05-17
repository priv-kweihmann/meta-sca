SUMMARY = "NPM: cspell"
DESCRIPTION = "A Spelling Checker for Code!"
HOMEPAGE = "https://github.com/Jason3S/cspell#readme"

DEPENDS = "npm-chalk-native npm-commander-native npm-comment-json-native npm-configstore-native npm-cspell-dict-companies-native npm-cspell-dict-cpp-native npm-cspell-dict-django-native npm-cspell-dict-elixir-native npm-cspell-dict-en-gb-native npm-cspell-dict-en-us-native npm-cspell-dict-fullstack-native npm-cspell-dict-golang-native npm-cspell-dict-java-native npm-cspell-dict-latex-native npm-cspell-dict-lorem-ipsum-native npm-cspell-dict-php-native npm-cspell-dict-python-native npm-cspell-dict-rust-native npm-cspell-dict-scala-native npm-cspell-lib-native npm-cspell-trie-native npm-fs-extra-native npm-gensequence-native npm-glob-native npm-minimatch-native npm-rxjs-native npm-vscode-uri-native npm-xregexp-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

SRC_URI = "https://registry.npmjs.org/cspell/-/cspell-3.2.10.tgz"
SRC_URI[md5sum] = "4aa298b1000904e311b5d286c5417208"
SRC_URI[sha256sum] = "c0e9bdab14546daa4d827ab8e2ffe2a255523375c955ddde9488f7cddd225be5"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell"

inherit npmhelper
inherit native
