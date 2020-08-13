SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-comment-json-native \
           npm-configstore-native \
           npm-cspell-dict-aws-native \
           npm-cspell-dict-bash-native \
           npm-cspell-dict-companies-native \
           npm-cspell-dict-cpp-native \
           npm-cspell-dict-cryptocurrencies-native \
           npm-cspell-dict-django-native \
           npm-cspell-dict-dotnet-native \
           npm-cspell-dict-elixir-native \
           npm-cspell-dict-en-gb-native \
           npm-cspell-dict-en-us-native \
           npm-cspell-dict-fonts-native \
           npm-cspell-dict-fullstack-native \
           npm-cspell-dict-golang-native \
           npm-cspell-dict-haskell-native \
           npm-cspell-dict-html-symbol-entities-native \
           npm-cspell-dict-java-native \
           npm-cspell-dict-latex-native \
           npm-cspell-dict-lorem-ipsum-native \
           npm-cspell-dict-lua-native \
           npm-cspell-dict-php-native \
           npm-cspell-dict-powershell-native \
           npm-cspell-dict-python-native \
           npm-cspell-dict-ruby-native \
           npm-cspell-dict-rust-native \
           npm-cspell-dict-scala-native \
           npm-cspell-dict-software-terms-native \
           npm-cspell-dict-typescript-native \
           npm-cspell-io-native \
           npm-cspell-trie-lib-native \
           npm-cspell-util-bundle-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-minimatch-native \
           npm-vscode-uri-native"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-4.2.0.tgz"
SRC_URI[md5sum] = "0716449d5eae499b416785f581dc6612"
SRC_URI[sha256sum] = "b6a115970df63df80f7f8bf45b98c6ea98d78e6f4e2fbb34ad4b20615d82c369"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native
