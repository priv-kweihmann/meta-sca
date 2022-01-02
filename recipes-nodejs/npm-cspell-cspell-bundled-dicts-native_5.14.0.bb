SUMMARY = "NPM: @cspell/cspell-bundled-dicts"
DESCRIPTION = "Dictionaries bundled with cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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
           npm-cspell-dict-public-licenses-native \
           npm-cspell-dict-python-native \
           npm-cspell-dict-ruby-native \
           npm-cspell-dict-rust-native \
           npm-cspell-dict-scala-native \
           npm-cspell-dict-software-terms-native \
           npm-cspell-dict-swift-native \
           npm-cspell-dict-typescript-native \
           npm-cspell-dict-vue-native"

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-bundled-dicts/-/cspell-bundled-dicts-5.14.0.tgz"
SRC_URI[md5sum] = "0307cce5d54f707d027c949bd8ab47cc"
SRC_URI[sha256sum] = "2aa57b41cff7534a3c5c4e323134d224522ae492feedaa8f05987f602b910822"

NPM_PKGNAME = "@cspell/cspell-bundled-dicts"

inherit npmhelper
inherit native
