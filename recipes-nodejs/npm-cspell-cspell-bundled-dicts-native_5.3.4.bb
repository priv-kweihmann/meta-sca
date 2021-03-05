SUMMARY = "NPM: @cspell/cspell-bundled-dicts"
DESCRIPTION = "Dictionaries bundled with cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-dict-ada-native \
           npm-cspell-dict-aws-native \
           npm-cspell-dict-bash-native \
           npm-cspell-dict-companies-native \
           npm-cspell-dict-cpp-native \
           npm-cspell-dict-cryptocurrencies-native \
           npm-cspell-dict-csharp-native \
           npm-cspell-dict-css-native \
           npm-cspell-dict-django-native \
           npm-cspell-dict-dotnet-native \
           npm-cspell-dict-elixir-native \
           npm-cspell-dict-en-gb-native \
           npm-cspell-dict-en-us-native \
           npm-cspell-dict-filetypes-native \
           npm-cspell-dict-fonts-native \
           npm-cspell-dict-fullstack-native \
           npm-cspell-dict-golang-native \
           npm-cspell-dict-haskell-native \
           npm-cspell-dict-html-native \
           npm-cspell-dict-html-symbol-entities-native \
           npm-cspell-dict-java-native \
           npm-cspell-dict-latex-native \
           npm-cspell-dict-lorem-ipsum-native \
           npm-cspell-dict-lua-native \
           npm-cspell-dict-node-native \
           npm-cspell-dict-npm-native \
           npm-cspell-dict-php-native \
           npm-cspell-dict-powershell-native \
           npm-cspell-dict-python-native \
           npm-cspell-dict-ruby-native \
           npm-cspell-dict-rust-native \
           npm-cspell-dict-scala-native \
           npm-cspell-dict-software-terms-native \
           npm-cspell-dict-typescript-native"

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-bundled-dicts/-/cspell-bundled-dicts-5.3.4.tgz"
SRC_URI[md5sum] = "f452db09ee81a3b94daeac9a58c0589b"
SRC_URI[sha256sum] = "870d2afa5e3ab8daf562002261fdaef8937181cbd291953ef0fd687978b33556"

NPM_PKGNAME = "@cspell/cspell-bundled-dicts"

inherit npmhelper
inherit native
