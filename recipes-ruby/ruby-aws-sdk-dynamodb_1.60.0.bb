SUMMARY = "RubyGem: aws-sdk-dynamodb"
DESCRIPTION = "Official AWS Ruby gem for Amazon DynamoDB (DynamoDB)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0bdedc1a816b8ca39736d84b6e741679"
SRC_URI[sha256sum] = "23068906fc5945b30ec06ea8d9a7bf12b7553bbfe999c2fef4f1b3b4ffacdab5"

GEM_NAME = "aws-sdk-dynamodb"

inherit rubygems
