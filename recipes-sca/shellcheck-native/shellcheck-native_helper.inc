## Unpack deb-package and move to files to correct path
do_unpack[depends] = "xz-native:do_populate_sysroot"

do_move_to_source() {
    mv ${WORKDIR}/usr ${S}
}

do_move_to_source[doc] = "Relocate sources from deb package"
addtask do_move_to_source after do_unpack before do_patch