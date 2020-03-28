SUMMARY = "User definied dictionary for cspell"
SRC_URI = "file://cspell_user.txt"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

inherit native

do_compile() {
    :
}

# To add a custom word to the dictionary
# create a recipe called 'cspell-user-dict-native_%.bbappend' in your layer
#
# In this recipe insert the following function
#
# do_compile_append() {
#   echo "<your word for the dict>" >> "${WORKDIR}/cspell_user.txt"
# }
#

do_install() {
    install -d "${D}${datadir}/cspell-user/"
    install "${WORKDIR}/cspell_user.txt" "${D}${datadir}/cspell-user/"
}

FILES_${PN} = "${datadir}"
