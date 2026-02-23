# enable clippy for native builds
do_install:append:class-native() {
    rust_runx install clippy

    install -d ${D}${bindir}
    cp build/${RUST_BUILD_SYS}/stage2-tools/${RUST_HOST_SYS}/release/cargo-clippy ${D}${bindir}
    patchelf --set-rpath "\$ORIGIN/../lib" ${D}${bindir}/cargo-clippy
}
