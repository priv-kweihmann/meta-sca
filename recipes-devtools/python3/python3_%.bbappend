INCLUDE_PYCS = "${@oe.utils.ifelse(d.getVar('PN').endswith('-native'), '0', '1')}"

do_install_append_class-native() {
    # Remove all pyc files, as they aren't really needed natively
    find ${D} -name "*.pyc" -type f -exec rm -f "{}" \;
}