SRC_URI += "https://proxy.golang.org/git.wow.st/gmp/jni/@v/v0.0.0-20210610011705-34026c7e22d0.zip;srcoutput=git.wow.st/gmp/jni;srcinput=git.wow.st/gmp/jni@v0.0.0-20210610011705-34026c7e22d0;downloadfilename=git-wow-st-gmp-jni-0.0.0-20210610011705-34026c7e22d0.zip;name=git-wow-st-gmp-jni"
SRC_URI[git-wow-st-gmp-jni.sha256sum] = "4bb787b86279d027b272d134a9bf3b74f497a5bdb840b2395860c4ebe6afb171"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/git.wow.st/gmp/jni/LICENSE;md5=d995c1c44529856a0f35a5ad43e51cc5 \
"

GOSRC_INCLUDEGUARD += "git.wow.st-gmp-jni-sources.inc"

