## Unpack deb-package and move to files to correct path

do_unpack[depends] = "xz-native:do_populate_sysroot"

do_move_to_source() {
    mv ${WORKDIR}/usr ${S}
}

addtask do_move_to_source after do_unpack before do_patch