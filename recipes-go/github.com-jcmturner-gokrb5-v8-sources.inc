SRC_URI_append = " https://proxy.golang.org/github.com/jcmturner/gokrb5/v8/@v/v8.4.2.zip;srcoutput=github.com/jcmturner/gokrb5/v8;srcinput=github.com/jcmturner/gokrb5/v8@v8.4.2;downloadfilename=github-com-jcmturner-gokrb5-v8-8.4.2.zip;name=github-com-jcmturner-gokrb5-v8"
SRC_URI[github-com-jcmturner-gokrb5-v8.sha256sum] = "eecd7120363321bb6b58b015395089958720271b3211659d802447d417af5970"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/jcmturner/gokrb5/v8/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"
