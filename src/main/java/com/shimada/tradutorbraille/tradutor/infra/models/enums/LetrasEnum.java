package com.shimada.tradutorbraille.tradutor.infra.models.enums;

public enum LetrasEnum {

    A(10241),
    B(10243),
    C(10249),
    D(10265),
    E(10257),
    F(10251),
    G(10267),
    H(10259),
    I(10250),
    J(10266),
    K(10245),
    L(10247),
    M(10253),
    N(10269),
    O(10277),
    P(10255),
    Q(10271),
    R(10263),
    S(10254),
    T(10270),
    U(10277),
    V(10279),
    W(10298),
    X(10285),
    Y(10301),
    Z(10293),
    UPPERCASE(10280);

    private final char codigo;

    LetrasEnum(int codigo) {
        this.codigo = (char) codigo;
    }

    public char getCodigo() {
        return codigo;
    }
}
